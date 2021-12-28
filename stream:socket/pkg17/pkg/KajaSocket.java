package pkg;

// WebSocket (HTML5의 websocket api)
//
// 1) 지금까지의 연결지속을 위한 polling 기법이 아닌 계속 연결이 유지되는 spec 으로
//    web browser 와 webserver 사이에 양방향 통신이 이루어지는 프로토콜이다
//
// 2) 시작은 http 가 연결 그다음은 websocket 에 의해 연결유지되며 일정시간이 지난 후에는 자동으로
//    연결 해제 된다.
//    즉, 일반적인 연결은 브라우저 - 웹서버에 자료 요청 - .html 로 응답 후 연결 해제하는 형식으로
//    http 는 stateless protocol 로 client 가 요청시에는 응답하는 one-way 통신방식
//    But websocket 은 웹서버가 응답 후에도 연결 유지되며 연결 지속 상태이므로 client 요청이 없어도 자료전송
//    즉, stateful protocol 로 계속 요청신호를 주어 overhead 가 발생하는 polling 방식이 필요없음
//    단, 연결이 유지되기 위해 소스코드가 복잡해지고 h/w 적 비용 상승

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ServerEndpoint("/kaja")
public class KajaSocket {
    // Session interface : client 가 websocket 접속시 만들어지며
    // 컬렉션으로 관리함 (즉, 자바의 socket 개념)
    // 1 브라우저(client) = 1 session 과는 다름
    // 즉, 여기에 모든 session 정보가 들어간다 (여기서의 session 은 c/s 모델 socket 과 같음)

    private static List<Session> listClient = Collections.synchronizedList(new ArrayList<>());
    // 동기화 처리 // 하나 처리하고 lock unlock 반복
    // thread-safe 컬렉션
    // Vector, HashTable 은 synchronized method 로 multi-thread 에서 문제 없음
    // ArrayList, HashMap, HashSet 등은 multi-thread 에서 not safe
    // 방법은 처리시 전체 lock 을 걸어줌
    // (이에비해 concurrent 는 처리되는 해당요소만 lock 을 건다)
    // (그러므로 SynchronizedMap 보다는 ConcurrentHashMap 클래스 사용시 속도가 빠름)

    @OnOpen // client 가 접속하면
    public void onOpen(Session session) {
        listClient.add(session); // 채팅 접속자 추가
    }

    @OnMessage // client 에서 chat이 오면 여기서 처리
    public void onMessage(Session session, String chat) throws IOException {
        // 여기서 모든 Session 에게 메시지를 전송
        // synchronized : thread-safe 가 목적으로 해당 thread 만 처리됨
        synchronized (listClient) {
            for (Session temp : listClient) {
                // 이것 안하면 내가 chat 한 것이 두번 출력
                if (!temp.equals(session)) {
                    temp.getBasicRemote().sendText(chat);
                    // chat 을 send
                }
            }
        }
    }

    @OnError // data 전송시 에러발생
    public void onError(Throwable e) {
        e.printStackTrace();
    }

    @OnClose // client 연결이 끊어지면
    public void onClose(Session session) {
        listClient.remove(session);
    }
}

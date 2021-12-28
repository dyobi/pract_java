package pkg17;

public class temp {
}
// ### 여러가지 통신 기술 (http는 stateless(connectionless))
//
// #. Polling 방식
// - 클라이언트에서 지속적으로 서버에 http request 하여 response를 받는 방식
//   (client는 일정한 주기로 request를 보냄)
// - 클라이언트가 많을 경우  서버 overhead  발생
//   또한 서버에  변경이 없을 경우라도 reqeust마다 response하게 되므로 필요없는 작업이 발생
//
// #. Long Polling 방식
// - 클라이언트에서 서버로 http request 후 서버 대기하다 response를 주고 클라이언트가
//   받으면 받자마자 다시 서버로 http request 하는 방식
// - 실시간 response가 가능
// - 클라이언트가 많을 경우 서버 overhead 발생
//
// #. Stream 방식
// - 클라이언트에서 서버로 http request 후 request를 유지시키고 response를 지속적으로 받는 방식
// - request의 유지가 문제
//
// -----------------------------------------------------------------------------
//
// #. HTML5 에서의 websocekt의 등장
// - http request 로 handshake (http -> websocket 으로 변경)
//       브라우저가 서버에 요청 (header에 upgrade에다가 websocket을 실어서 보냄
//       즉 http에서 tcp/ip로 변경)
// - stateless로 작동하는 http와는 달리 접속시작은 http를 사용하고 그 후 websocket 규약에 의해 작동
//       (http: 80, https: 443 포트)
// - 특정한 port를 통하여 stateful로 작동하므로 언제나 양방향 통신 가능
//   (기존의 http는 클라이언트가 요청을 보내고 서버가 응답하는 one-way 통신)
// - server side 의 data 변경시 client에서 변경되는 것이 가능해짐
//   (기존의 http는 서버쪽이 변경되어도 자동으로 client에 반영되지 않음)
// - websocket 작동하기 (http는 다른 client의 요청이 없으면 응답할 수 없음)
//   (client ---- server로 // 서버는  다른 client로 전송 ---- client)
//       HTTP > AJAX > WEBSOCKET

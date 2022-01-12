// totalcount : 파라미터
// pageno : 파라미터
// pagesize, blocksize: 상수
// 페이지의 개수

const PAGE_SIZE = 10;
const BLOCK_SIZE = 5;

function getPagination(totalcount, pageno) {
     // -1은 뭐지?   +1은 뭐지?
    const countOfPage = Math.floor((totalcount-1)/PAGE_SIZE)+1;

    const blockno = Math.floor((pageno-1)/BLOCK_SIZE);
    const prev = blockno * BLOCK_SIZE;
    const start = prev + 1;
    // let a = 5>10? 100 : 1000;  ->  let a = 1000;     삼항 연산자
    // 둘 중의 하나를 고르는 경우에만 if보다 짧게 나온다
    // end는 prev+5 아니면 countOfPage, next는 start+6 아니면 0

    // prev+5는 계산에 의한 마지막 페이지. 마지막 블록이기 때문에 마지막 페이지가 countOfPage보다 같거나 작다
    const end = (prev+BLOCK_SIZE)>countOfPage ? countOfPage : prev+BLOCK_SIZE;
    const next = (prev+BLOCK_SIZE)>=countOfPage ? 0 : prev+BLOCK_SIZE+1;

    // return { prev:prev, start:start, end:end, next:next};
    return {prev, start, end, next};
}
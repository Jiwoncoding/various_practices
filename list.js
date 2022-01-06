const PAGE_SIZE = 10;
const PAGE_PER_BLOCK = 5;

// function getPageno() { }
const getPageno = ()=>{
    const index = location.search.indexOf('=');
    const param = location.search.substr(index+1);
    const pageno = parseInt(param);
    if(isNaN(pageno)==true) 
        location.href = "list.html?pageno=1";
    else
        return pageno;
}

const getPagination = (result)=>{
    // 개수 : 123, 페이지수: 13
    // pageno       blockNo     startPage           prev                endPage             next
    //  1~5             0       blockNo*5+1: 1      startPage-1         startPage+5-1:5     endPage+1
    //  6~10            1       blockNo*5+1: 6      startPage-1         startPage+5-1:10    endPage+1 
    // 11~13            2       blockNo*5+1:11      startPage-1         startPage+5-1:15    endPage+1
    let blockNo = Math.floor(result.pageno/PAGE_PER_BLOCK);
    if(result.pageno%PAGE_PER_BLOCK==0)
        blockNo--;
    const startPage = blockNo * PAGE_PER_BLOCK + 1;
    const prev = startPage - 1;
    let endPage = startPage + PAGE_PER_BLOCK -1;
    let next = endPage +1;

    let countOfPage = Math.floor(result.totalcount/PAGE_SIZE)+1;
    if(result.totalcount%PAGE_SIZE==0)
        countOfPage--;
    if(endPage>=countOfPage) {
        endPage = countOfPage;
        next = 0;
    }
    // 구조 분해 할당
    return {prev, startPage, endPage, next};
}

// 정적 분석 : ESLint, SonarLint.....
const printContacts = (contacts)=>{
    const $list = $('#list');
    // for(let i=?;  ;) : 배열의 인덱스 값
    // for(ob of ar) : 배열의 원소를 하나씩 꺼내면서
    // $.each(배열, function(idx, 원소)  { }) : 인덱스와 원소를 함께 사용할 수 있다
    $.each(contacts, function(idx, contact) {
        const $tr = $('<tr>').appendTo($list);
        $('<td>').text(contact.no).appendTo($tr);
        const $td = $('<td>').appendTo($tr);
        $('<a>').attr('href', 'read.html?no=' + contact.no).text(contact.name).appendTo($td);
        $('<td>').text(contact.address).appendTo($tr);
        $('<td>').text(contact.tel).appendTo($tr);
    });
}

const printPagination = (pagination, pageno)=>{
    const $pagination = $('#pagination_div').find('.pagination');
    if(pagination.prev>0) {
        const $prev = $('<li>').appendTo($pagination);
        $('<a>').attr('href', "list.html?pageno="+pagination.prev).text('이전').appendTo($prev);
    }
    for(let i=pagination.startPage; i<=pagination.endPage; i++) {
        const $li = $('<li>').appendTo($pagination);
        if(pageno==i) 
            $li.attr('class','active');
        $('<a>').attr('href', "list.html?pageno="+i).text(i).appendTo($li);
    }
    if(pagination.next>0) {
        const $next = $('<li>').appendTo($pagination);
        $('<a>').attr('href', "list.html?pageno="+pagination.next).text('다음').appendTo($next);
    }
}
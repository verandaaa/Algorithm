function solution(genres, plays) {
    let answer = [];
    let map = new Map();
    let total=new Map();

    genres.forEach((_,i)=>{ //두가지 맵 생성
        if (!map.has(genres[i])) {
            map.set(genres[i], [[i,plays[i]]]);
            total.set(genres[i],plays[i]);
        }
        else {
            map.get(genres[i]).push([i,plays[i]]);
            total.set(genres[i],total.get(genres[i])+plays[i]);
        }
    });
    map.forEach((value,key)=>{   //두가지 맵 정렬
        map.set(key, value.sort((a,b)=>b[1]-a[1]));
    });
    total=new Map([...total].sort((a,b)=>b[1]-a[1]));
    
    total.forEach((_,key)=>{ //결과값 구하기
        answer=answer.concat(map.get(key).slice(0,2));
    });
    answer=answer.map(v=>v[0]);

    return answer;
}

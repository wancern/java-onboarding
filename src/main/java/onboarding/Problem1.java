package onboarding;

import java.util.*;
/*
* 1. 예외사항 체크 메소드 작성
* 2. 최댓값 메소드 작성
* 3. 점수 비교 메소드 작성
* 4. 점수 계산 및 결과 산출
* */
class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    // 예외사항 체크 메소드( 예외사항일때 true 리턴 )
    public static boolean exception(List<Integer> pobi, List<Integer>crong){
        if(pobi.get(0) % 2 != 1 || crong.get(0) % 2 != 1){
            return true;
        }
        if(pobi.get(0) + 1 != pobi.get(1) || crong.get(0) + 1 != crong.get(1)){
            return true;
        }
        if(pobi.get(0) == 1 || pobi.get(1) == 400 || crong.get(0) == 1 || crong.get(1) == 400 ){
            return true;
        }
        return false;
    }
}
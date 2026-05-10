class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
        );

        int sum = 0;

        for(int i=s.length() - 1;i>=0;i--){

            if(i!=0){
                            if(s.charAt(i) == 'V' || s.charAt(i) == 'X' ){
                if(s.charAt(i-1) == 'I'){
                    sum+=romanMap.get(s.charAt(i)) -1;
                    i--;
                    continue;
                }
            }
            else if(s.charAt(i) == 'L' || s.charAt(i) == 'C'){
                if(s.charAt(i-1) == 'X'){
                    sum+=romanMap.get(s.charAt(i)) -10;
                    i--;
                    continue;
                }

            }
            else if(s.charAt(i) == 'D' ||s.charAt(i) == 'M' ){
                if(s.charAt(i-1) == 'C'){
                    sum+=romanMap.get(s.charAt(i)) -100;
                    i--;
                    continue;
                }
            }

            }

            sum+=romanMap.get(s.charAt(i));
        }

        return sum;

        
    }
}

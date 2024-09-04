public class LetterCombinationofPhoneNumber {
        public void possible(int index, List<String> ls, StringBuilder sb,String[] map,String digits){
            if(index>=digits.length()){
                ls.add(sb.toString());
                return;
            }
            int curr = digits.charAt(index) - '0';
            String val = map[curr];
            for(int i=0;i<val.length();i++){
                char ch = val.charAt(i);
                sb.append(ch);
                possible(index+1,ls,sb,map,digits);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        public List<String> letterCombinations(String digits) {
            List<String> ls = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            if(digits.length() == 0) return ls;
            String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            int index=0;
            possible(index,ls,sb,map,digits);
            return ls;
        }
}

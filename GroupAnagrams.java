public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> ls= new ArrayList<>();
            HashMap<String,List<String>> hm=new HashMap<>();
            for(String str:strs){
                char[] ch = str.toCharArray();
                Arrays.sort(ch);
                String st = new String(ch);
                if(!hm.containsKey(st))
                    hm.put(st,new ArrayList<>());
                hm.get(st).add(str);
            }
            for(String str : hm.keySet()){
                ls.add(hm.get(str));
            }
            return ls;
        }

}

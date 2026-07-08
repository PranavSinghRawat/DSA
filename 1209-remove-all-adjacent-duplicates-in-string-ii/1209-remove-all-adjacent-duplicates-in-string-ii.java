class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Map<Character,Integer>> st=new Stack<>();
        StringBuilder ans=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek().containsKey(ch)){
                int count=st.peek().get(ch)+1;

                if(count==k){
                    st.pop();
                }else{
                    st.peek().put(ch,count);
                }
            }else{
                Map<Character,Integer> map=new HashMap<>();
                map.put(ch,1);
                st.push(map);
            }
        }

        while(!st.isEmpty()){
            Map<Character,Integer> map=st.pop();
            for(char ch:map.keySet()){
                int count=map.get(ch);
                while(count-->0)
                    ans.append(ch);
            }
        }

        return ans.reverse().toString();
    }
}
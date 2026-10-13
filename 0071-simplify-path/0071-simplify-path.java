class Solution {
    public String simplifyPath(String path) {
        String arr[] = path.split("/");
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(arr[i].equals(".") || arr[i].equals("")) continue;
            else st.push(arr[i]);
        }
        if(st.isEmpty()) return "/";
        while(!st.isEmpty()){
            sb.insert(0, "/"+st.pop());
        }
        return sb.toString();

    }
}
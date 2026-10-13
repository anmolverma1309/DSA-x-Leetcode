class Solution {
    public String simplifyPath(String path) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(path.split("/")));
        ArrayList<String> st = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.size(); i++){
            String temp = arr.get(i);

            if(temp.equals("") || temp.equals(".")) continue;
            else if(temp.equals("..")){
                if(!st.isEmpty()) st.remove(st.size()-1);
            }
            else st.add(temp);
        }
        for(String temp: st){
            sb.append("/").append(temp);
        }
        return sb.length() == 0? "/": sb.toString();


        // String arr[] = path.split("/");
        // Stack<String> st = new Stack<>();
        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i].equals("..")){
        //         if(!st.isEmpty()){
        //             st.pop();
        //         }
        //     }else if(arr[i].equals(".") || arr[i].equals("")) continue;
        //     else st.push(arr[i]);
        // }
        // if(st.isEmpty()) return "/";
        // while(!st.isEmpty()){
        //     sb.insert(0, "/"+st.pop());
        // }
        // return sb.toString();

    }
}
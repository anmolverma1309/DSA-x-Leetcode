class Solution {

    HashSet<String> st = new HashSet<>();
    int n;
    int maxLen = 0;

    public List<String> removeInvalidParentheses(String s) {

        n = s.length();
        st.clear();
        maxLen = 0;

        solve(s, 0, new StringBuilder(), 0);

        return new ArrayList<>(st);
    }

    void solve(String s, int i, StringBuilder curr, int count) {

        if (i == n) {

            if (count == 0) {

                if (curr.length() > maxLen) {
                    st.clear();
                    maxLen = curr.length();
                }

                if (curr.length() == maxLen) {
                    st.add(curr.toString());
                }
            }

            return;
        }

        char ch = s.charAt(i);

        // Alphabet
        if (ch != '(' && ch != ')') {

            curr.append(ch);

            solve(s, i + 1, curr, count);

            curr.deleteCharAt(curr.length() - 1);

            return;
        }

        // TAKE parenthesis
        if (ch == '(' || count > 0) {

            curr.append(ch);

            if (ch == '(')
                solve(s, i + 1, curr, count + 1);
            else
                solve(s, i + 1, curr, count - 1);

            curr.deleteCharAt(curr.length() - 1);
        }

        // DON'T TAKE parenthesis
        solve(s, i + 1, curr, count);
    }
}
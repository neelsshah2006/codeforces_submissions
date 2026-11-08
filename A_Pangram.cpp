#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    string s;
    cin >> s;
    unordered_set<char> st;
    for (char c : s)
    {
        if (c < 'a' || c > 'z')
            c = c + 'a' - 'A';
        st.insert(c);
    }

    cout << (st.size() == 26 ? "YES\n" : "NO\n");
    return 0;
}
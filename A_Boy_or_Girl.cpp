#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s;
    cin >> s;
    unordered_set<char> st;
    for (char c : s)
    {
        st.insert(c);
    }

    cout << (st.size() % 2 == 0 ? "CHAT WITH HER!\n" : "IGNORE HIM!\n");
    return 0;
}
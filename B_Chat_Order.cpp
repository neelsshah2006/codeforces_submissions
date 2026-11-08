#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    string s[n];
    for(int i = 0; i < n; i++) {
        cin >> s[i];
    }

    unordered_set<string> st;
    for(int i = n - 1; i >= 0; i--) {
        if(st.find(s[i]) == st.end()) {
            cout << s[i] << '\n';
            st.insert(s[i]);
        }
    }
    return 0;
}
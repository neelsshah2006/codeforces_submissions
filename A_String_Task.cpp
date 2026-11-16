#include <bits/stdc++.h>
using namespace std;

void solve()
{
    string s;
    cin >> s;
    string ans = "";
    for (char c : s)
    {
        c = (c >= 'A' && c <= 'Z' ? c - 'A' + 'a' : c);
        if (c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u' || c == 'i')
            continue;

        if (c >= 'a' && c <= 'z')
        {
            ans += ".";
            ans += c;
        }
    }
    cout << ans << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}
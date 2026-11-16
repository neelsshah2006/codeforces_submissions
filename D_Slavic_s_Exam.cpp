#include <bits/stdc++.h>
using namespace std;

void solve()
{
    string s, t;
    cin >> s >> t;
    int i = 0, j = 0;
    int n = s.size(), m = t.size();
    while (i < n)
    {
        if (s[i] == t[j] || s[i] == '?')
        {
            s[i] = t[j];
            j++;
        }

        i++;
        if (j == m)
            break;
    }

    while (i < n)
    {
        if (s[i] == '?')
            s[i] = 'a';
        i++;
    }

    cout << (j == m ? "YES\n" + s + "\n" : "NO\n");
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        solve();
    }
    return 0;
}
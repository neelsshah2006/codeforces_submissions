
#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;

    string s;
    cin >> s;
    vector<int> players;
    for (int i = 0; i < n; i++)
    {
        if (s[i] == '2')
        {
            players.push_back(i);
        }
    }

    int cnt = players.size();

    if (cnt == 1 || cnt == 2)
    {
        cout << "NO\n";
        return;
    }

    vector<string> ans(n, string(n, '='));

    for (int i = 0; i < n; i++)
    {
        ans[i][i] = 'X';
    }

    if (cnt >= 3)
    {
        for (int i = 0; i < cnt; i++)
        {
            int u = players[i];
            int v = players[(i + 1) % cnt];

            ans[u][v] = '+';
            ans[v][u] = '-';
        }
    }

    cout << "YES\n";
    for (int i = 0; i < n; i++)
    {
        cout << ans[i] << '\n';
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }

    return 0;
}

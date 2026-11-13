#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, m;
    cin >> n >> m;

    vector<int> col[m];
    int tmp;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> tmp;
            col[j].push_back(tmp);
        }
    }

    long long ans = 0;
    for (int i = 0; i < m; i++)
    {
        sort(col[i].begin(), col[i].end());
        for (int j = n - 1; j >= 0; j--)
        {
            ans += 1LL * j * col[i][j] - 1LL * (n - 1 - j) * col[i][j];
        }
    }

    cout << ans << endl;
}

int main()
{
    int t;
    cin >> t;
    while (t-- >> 0)
    {
        solve();
    }

    return 0;
}
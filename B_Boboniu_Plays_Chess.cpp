#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, m, sx, sy;
    cin >> n >> m >> sx >> sy;
    cout << sx << " " << sy << '\n';

    int prev = sy;
    for (int j = 1; j <= m; j++)
    {
        if (j != sy)
        {
            cout << sx << " " << j << '\n';
            prev = j;
        }
    }

    int nxtPrev = prev;
    for (int i = 1; i <= n; i++)
    {
        if (i == sx)
            continue;

        cout << i << " " << prev << '\n';
        for (int j = 1; j <= m; j++)
        {
            if (j != prev)
            {
                cout << i << " " << j << '\n';
                nxtPrev = j;
            }
        }
        prev = nxtPrev;
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    solve();
    return 0;
}
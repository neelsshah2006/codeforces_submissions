
#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, m;
    cin >> n >> m;

    vector<vector<int>> a(n, vector<int>(m));

    vector<bool> row(n, false);
    vector<bool> col(m, false);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> a[i][j];

            if (a[i][j] == 1)
            {
                row[i] = true;
                col[j] = true;
            }
        }
    }

    int freeRows = 0;
    int freeCols = 0;

    for (int i = 0; i < n; i++)
    {
        if (!row[i])
            freeRows++;
    }

    for (int j = 0; j < m; j++)
    {
        if (!col[j])
            freeCols++;
    }

    int moves = min(freeRows, freeCols);

    if (moves % 2 == 1)
    {
        cout << "Ashish\n";
    }
    else
    {
        cout << "Vivek\n";
    }
}

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        solve();
    }

    return 0;
}

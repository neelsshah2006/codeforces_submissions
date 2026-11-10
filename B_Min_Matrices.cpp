#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, k;
    cin >> n >> k;

    if (k < n || k >= 2 * n)
    {
        cout << -1 << '\n';
        return;
    }

    int arr[n][n];
    int n2 = n * n;
    int start = k - n + 1;
    for (int i = 0; i < n; i++)
    {
        arr[i][i] = start++;
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (i == j)
            {
                cout << arr[i][j] << ' ';
                continue;
            }

            arr[i][j] = start;
            start = (start % n2) + 1;
            cout << arr[i][j] << ' ';
        }
        cout << '\n';
    }
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
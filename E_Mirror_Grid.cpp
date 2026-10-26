#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n;
        cin >> n;
        string grid[n];
        for (int i = 0; i < n; i++)
        {
            cin >> grid[i];
        }

        int h = n / 2;
        int h1 = (n % 2 == 0 ? h : h + 1);
        int ops = 0;
        for (int i = 0; i < h1; i++)
        {
            for (int j = 0; j < h; j++)
            {
                int pos1 = grid[i][j] - '0';
                int pos2 = grid[j][n - i - 1] - '0';
                int pos3 = grid[n - j - 1][i] - '0';
                int pos4 = grid[n - i - 1][n - j - 1] - '0';

                int sum = pos1 + pos2 + pos3 + pos4;
                ops += min(sum, 4 - sum);
            }
        }
        cout << ops << '\n';
    }
    return 0;
}
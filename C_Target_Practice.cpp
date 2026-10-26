#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t, points;
    cin >> t;
    string board[10];
    while (t-- > 0)
    {
        for (int i = 0; i < 10; i++)
        {
            cin >> board[i];
        }

        points = 0;
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (board[i][j] != 'X')
                {
                    continue;
                }

                points += min(min(i, 9 - i), min(j, 9 - j)) + 1;
            }
        }
        cout << points << '\n';
    }
    return 0;
}
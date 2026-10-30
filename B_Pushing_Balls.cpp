#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--)
    {
        int n, m;
        cin >> n >> m;

        vector<string> s(n);

        for (int i = 0; i < n; i++)
            cin >> s[i];

        bool ans = true;

        for (int i = 1; i < n && ans; i++)
        {
            for (int j = 1; j < m && ans; j++)
            {
                if (s[i][j] == '1')
                {
                    bool top = true;
                    bool left = true;

                    for (int k = 0; k < i; k++)
                    {
                        if (s[k][j] == '0')
                            top = false;
                    }

                    for (int k = 0; k < j; k++)
                    {
                        if (s[i][k] == '0')
                            left = false;
                    }

                    if (!top && !left)
                        ans = false;
                }
            }
        }

        cout << (ans ? "YES\n" : "NO\n");
    }

    return 0;
}
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
        string s;
        cin >> s;

        if (count(s.begin(), s.end(), 'T') != 2 * count(s.begin(), s.end(), 'M'))
        {
            cout << "NO\n";
            continue;
        }

        int cnt = 0;
        bool ans = true;
        for (int i = 0; i < n; i++)
        {
            if (s[i] == 'T')
                cnt++;
            else
            {
                cnt--;
                if (cnt == -1)
                {
                    ans = false;
                    break;
                }
            }
        }

        if (!ans)
        {
            cout << "NO\n";
            continue;
        }

        cnt = 0;
        for (int i = n - 1; i >= 0; i--)
        {
            if (s[i] == 'T')
                cnt++;
            else
            {
                cnt--;
                if (cnt == -1)
                {
                    ans = false;
                    break;
                }
            }
        }

        cout << (ans ? "YES\n" : "NO\n");
    }
    return 0;
}
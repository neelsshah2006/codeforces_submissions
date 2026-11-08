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
        int n, m, a, b, c, d;
        cin >> n >> m;
        bool ans = false;
        for (int i = 0; i < n; i++)
        {
            cin >> a >> b >> c >> d;
            if (!ans && b == c)
                ans = true;
        }

        if (m % 2 == 0 && ans == true)
        {
            cout << "YES\n";
        }
        else
        {
            cout << "NO\n";
        }
    }
    return 0;
}
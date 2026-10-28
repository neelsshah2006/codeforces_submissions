#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    int n, a, b, tmp;
    while (t-- > 0)
    {
        cin >> n;
        a = 0;
        b = 0;
        for (int i = 0; i < n; i++)
        {
            cin >> tmp;
            if (tmp % 2 == 0 && i % 2 == 1)
                a++;
            else if (tmp % 2 == 1 && i % 2 == 0)
                b++;
        }

        if (a != b)
            cout << -1 << '\n';
        else
            cout << a << '\n';
    }
    return 0;
}
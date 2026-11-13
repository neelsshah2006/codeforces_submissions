#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int a[n] = {0};
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    int i = n - 2;
    int ops = 0;
    for (; i >= 0; i--)
    {
        if (a[i + 1] == 0)
        {
            break;
        }

        while (a[i] >= a[i + 1])
        {
            ops++;
            a[i] /= 2;
        }
    }
    if (i != -1)
    {
        cout << "-1\n";
        return;
    }

    cout << ops << "\n";
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
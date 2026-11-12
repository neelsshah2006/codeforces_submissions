#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;

    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    sort(a.begin(), a.end());
    vector<int> ans(n);
    int l = 0, r = n - 1;
    int i = 0;
    while (l <= r)
    {
        if (l == r)
        {
            ans[l] = a[i];
            break;
        }

        ans[l] = a[i];
        ans[r] = a[i + 1];
        l++;
        r--;
        i += 2;
    }

    int vis = 1;
    int mx = 0;

    for (int i = 1; i < n; i++) {
        if(ans[i] > ans[mx]) {
            vis++;
            mx = i;
        }
    }
    int prev_mx = mx;
    mx = -1;

    for (int i = n - 1; i > prev_mx; i--)
    {
        if (ans[i] > mx)
        {
            if (i != 0)
                vis++;
            mx = ans[i];
        }
    }

    cout << vis << '\n';

    for (int x : ans)
        cout << x << " ";

    cout << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--)
        solve();
}
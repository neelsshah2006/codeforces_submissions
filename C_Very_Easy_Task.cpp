#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, x, y;
    cin >> n >> x >> y;
    long long t = min(x, y);
    long long low = t;
    long long high = n * t;
    long long ans = high;
    while (low <= high)
    {
        int mid = low + (high - low) / 2;
        long long prints = 1 + (1LL * (mid - t) / x) + (1LL * (mid - t) / y);
        if (prints >= n)
        {
            ans = mid;
            high = mid - 1;
        }
        else
            low = mid + 1;
    }
    cout << ans << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}
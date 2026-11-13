#include <bits/stdc++.h>
using namespace std;

void solve()
{
    long long a, b;
    cin >> a >> b;
    cout << b / __gcd(b, a) * a * ((b % a == 0) ? (b / a) : 1) << '\n';
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
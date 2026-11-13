#include <bits/stdc++.h>
using namespace std;

long long binExp(long long a, long long b)
{
    long long res = 1;

    while (b > 0)
    {
        if (b & 1)
            res *= a;

        a *= a;
        b >>= 1;
    }

    return res;
}

void solve()
{
    long long n;
    cin >> n;

    if (n == 3)
    {
        cout << 24 << '\n';
        return;
    }

    long long total = (36 * n - 12) * binExp(4, n - 4);
    cout << total << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    solve();
    return 0;
}

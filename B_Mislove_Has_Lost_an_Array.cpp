#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, l, r;
    cin >> n >> l >> r;

    int mn = (1 << l) + (n - l) - 1;
    int mx = (1 << r) + ((1 << (r - 1)) * (n - r)) - 1;

    cout << mn << " " << mx << '\n';
    return 0;
}
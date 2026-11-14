#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, k;
    cin >> n >> k;
    unordered_map<int, int> mp;
    int tmp;
    int p = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        mp[tmp]++;
        if (mp[tmp] % 2 == 0)
        {
            p += 2;
        }
    }

    p += ceil((n - p) / 2.0);
    cout << p << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}
#include <bits/stdc++.h>
using namespace std;
const string vowels = "aeiou";

void solve()
{
    int n;
    cin >> n;
    int base = n / 5;
    int rem = n % 5;

    string ans;

    for (int i = 0; i < 5; i++)
    {
        int cnt = base + (i < rem ? 1 : 0);
        ans += string(cnt, vowels[i]);
    }

    cout << ans << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }

    return 0;
}
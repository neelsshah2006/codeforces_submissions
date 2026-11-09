#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;

    int prev, curr;
    cin >> prev;

    bool strictlyDecreasing = true;

    for (int i = 1; i < n; i++)
    {
        cin >> curr;
        if (curr >= prev)
            strictlyDecreasing = false;
        prev = curr;
    }

    cout << (strictlyDecreasing ? "NO\n" : "YES\n");
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
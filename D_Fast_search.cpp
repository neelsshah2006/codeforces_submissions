#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    sort(arr.begin(), arr.end());

    int k;
    cin >> k;

    int l, r;
    while (k-- > 0)
    {
        cin >> l >> r;
        auto lb = lower_bound(arr.begin(), arr.end(), l);
        auto rb = upper_bound(arr.begin(), arr.end(), r);
        cout << rb - lb << " ";
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}
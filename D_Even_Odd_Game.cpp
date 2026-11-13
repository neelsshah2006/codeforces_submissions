#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;

    vector<int> arr(n);
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    sort(arr.rbegin(), arr.rend());

    long long alice = 0, bob = 0;
    for (int i = 0; i < n; i++)
    {
        if (i % 2 == 0)
        {
            if (arr[i] % 2 == 0)
                alice += arr[i];
        }
        else
        {
            if (arr[i] % 2 == 1)
                bob += arr[i];
        }
    }

    cout << (alice == bob ? "Tie\n" : (alice > bob ? "Alice\n" : "Bob\n"));
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--)
        solve();

    return 0;
}
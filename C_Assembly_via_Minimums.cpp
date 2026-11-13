#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;

    long long x = 1LL * n * (n - 1) / 2;
    int arr[x];
    for (int i = 0; i < x; i++)
    {
        cin >> arr[i];
    }

    sort(arr, arr + x);

    int i = 0;
    long long j = 0LL;
    while (j < x)
    {
        cout << arr[j] << " ";
        j += n - i - 1LL;
        i++;
    }
    cout << arr[j - 1] << "\n";
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
#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int x;
    cin >> x;
    int n = 2 * x;
    int arr[n];
    bool allSame = true;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
        if (arr[i] != arr[0])
            allSame = false;
    }

    if (allSame)
    {
        cout << "-1\n";
        return;
    }

    sort(arr, arr + n);
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << ' ';
    }
    cout << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}
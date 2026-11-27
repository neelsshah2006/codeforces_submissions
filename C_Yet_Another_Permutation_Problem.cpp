#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;

    unordered_set<int> in;
    int i = 1;
    int cnt = 0;
    while (cnt < n)
    {
        int key = i;
        while (key <= n)
        {
            cout << key << " ";
            in.insert(key);
            key *= 2;
            cnt++;
        }
        while (in.find(i) != in.end())
            i++;
    }
    cout << "\n";
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
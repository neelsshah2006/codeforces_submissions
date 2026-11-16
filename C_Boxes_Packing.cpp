#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, tmp;
    cin >> n;
    map<int, int> mp;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        mp[tmp]++;
    }
    int boxes = 1;
    for (auto it : mp)
    {
        boxes = max(boxes, it.second);
    }
    cout << boxes;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}
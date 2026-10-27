#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k;
    cin >> n;
    unordered_map<int, vector<int>> mp;
    for (int i = 1; i <= n; i++)
    {
        cin >> k;
        mp[k].push_back(i);
    }

    int min_cnt = min(mp[1].size(), min(mp[2].size(), mp[3].size()));
    cout << min_cnt << '\n';
    for (int i = 0; i < min_cnt; i++)
    {
        cout << mp[1][i] << " " << mp[2][i] << " " << mp[3][i] << '\n';
    }
    return 0;
}
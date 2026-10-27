#include <bits/stdc++.h>
using namespace std;

bool comp(pair<int, int> a, pair<int, int> b)
{
    if (a.first == b.first)
    {
        return b.second < a.second;
    }
    return a.first < b.first;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int s, n;
    cin >> s >> n;
    pair<int, int> dragons[n];
    for (int i = 0; i < n; i++)
    {
        cin >> dragons[i].first >> dragons[i].second;
    }

    sort(dragons, dragons + n, comp);
    bool ans = true;
    for (int i = 0; i < n; i++)
    {
        if (s <= dragons[i].first)
        {
            ans = false;
            break;
        }
        s += dragons[i].second;
    }
    cout << (ans ? "YES\n" : "NO\n");
    return 0;
}
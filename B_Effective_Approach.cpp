#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, tmp;
    cin >> n;
    unordered_map<int, int> mp;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        mp[tmp] = i + 1;
    }

    cin >> m;
    long long comp1 = 0, comp2 = 0;
    for (int i = 0; i < m; i++)
    {
        cin >> tmp;
        tmp = mp[tmp];
        comp1 += tmp;
        comp2 += n + 1 - tmp;
    }
    cout << comp1 << " " << comp2 << '\n';
    return 0;
}
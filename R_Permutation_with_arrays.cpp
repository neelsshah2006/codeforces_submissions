#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, tmp;
    cin >> n;
    unordered_map<int, int> a;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        a[tmp]++;
    }

    bool ans = true;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        if (a.find(tmp) == a.end())
        {
            ans = false;
            break;
        }

        a[tmp]--;
        if (a[tmp] == 0)
            a.erase(tmp);
    }
    cout << (ans && a.size() == 0 ? "yes\n" : "no\n");
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n;
        cin >> n;

        int tmp;
        map<int, int> mp;
        for (int i = 0; i < n; i++)
        {
            cin >> tmp;
            mp[tmp]++;
        }

        int els = mp.size();
        if (els <= 1)
        {
            cout << "-1" << '\n';
            continue;
        }

        string s = "";
        auto it = mp.begin();
        int a = 0;
        for (int i = 0; i < els / 2; i++)
        {
            int k = (*it).first;
            int v = (*it).second;
            a += v;
            while (v-- > 0)
                s += to_string(k) + " ";
            it++;
        }
        s += '\n';
        int b = 0;
        while (it != mp.end())
        {
            int k = (*it).first;
            int v = (*it).second;
            b += v;
            while (v-- > 0)
                s += to_string(k) + " ";
            it++;
        }

        cout << a << " " << b << '\n';
        cout << s << '\n';
    }
    return 0;
}
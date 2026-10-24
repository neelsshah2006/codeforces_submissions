#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    int n, k, tmp;
    while (t-- > 0)
    {
        cin >> n >> k;
        vector<int> map(n + 1);
        for (int i = 0; i < n; i++)
        {
            cin >> tmp;
            map[tmp] = map[tmp] + 1;
        }

        int cnt = 0, less = 0;
        bool possible = true;
        while (possible)
        {
            if (map[cnt] != 0 && map[cnt] + less >= k)
            {
                less += map[cnt] - k;
                cnt++;
            }
            else
            {
                possible = false;
            }
        }

        cout << cnt << endl;
    }
    return 0;
}
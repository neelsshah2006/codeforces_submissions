#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n, k;
        cin >> n >> k;
        string match, curr;
        int cnt = 1;
        cin >> match;
        for (int i = 1; i < n; i++)
        {
            cin >> curr;
            bool include = true;
            for (int j = 0; j < k; j++)
            {
                if (curr[j] != match[j])
                    include = false;
            }
            if (include)
                cnt++;
        }
        cout << cnt << '\n';
    }
    return 0;
}
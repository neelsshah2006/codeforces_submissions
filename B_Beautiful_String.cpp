#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    string ans;
    while (t-- > 0)
    {
        int n;
        cin >> n;
        string s;
        cin >> s;

        bool isInc = true;
        for (int i = 1; i < n; i++)
        {
            if (s[i] < s[i - 1])
                isInc = false;
        }

        if (isInc)
        {
            ans += to_string(n) + "\n";
            for (int i = 1; i <= n; i++)
            {
                ans += to_string(i) + " ";
            }
            ans += "\n";
            continue;
        }

        int l = 0, r = n - 1;
        bool isPalindromic = true;
        while (l < r)
        {
            if (s[l] == s[r])
            {
                l++;
                r--;
            }
            else
            {
                isPalindromic = false;
                break;
            }
        }

        if (isPalindromic)
        {
            ans += "0\n\n";
            continue;
        }

        string tmp = "";
        int cnt = 0;
        for (int i = l; i <= r; i++)
        {
            if (s[i] == '1')
            {
                tmp += to_string(i + 1) + " ";
                cnt++;
            }
        }
        ans += to_string(cnt) + "\n" + tmp + "\n";
    }
    cout << ans;
    return 0;
}
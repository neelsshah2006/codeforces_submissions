#include <bits/stdc++.h>
using namespace std;

bool isPalindrome(const string &s)
{
    bool ans = true;
    int n = s.length();
    int h = n / 2;
    for (int i = 0; i < h; i++)
    {
        if (s[i] != s[n - i - 1])
        {
            ans = false;
            break;
        }
    }
    return ans;
}

bool allSame(const string &s)
{
    for (int i = 1; i < (int)s.size(); i++)
    {
        if (s[i] != s[0])
            return false;
    }

    return true;
}

string solve(string &s, int k)
{
    int x;
    while (k > 0)
    {
        if (allSame(s))
        {
            s.append(k, s[0]);
            break;
        }

        x = s.length();
        if (isPalindrome(s))
        {
            s = s + s.back();
        }
        else
        {
            s.resize(x / 2);
        }
        k--;
    }
    return s;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    int n, k;
    string s;
    while (t-- > 0)
    {
        cin >> n >> k;
        cin >> s;
        cout << solve(s, k) << '\n';
    }
    return 0;
}
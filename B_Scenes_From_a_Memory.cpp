#include <bits/stdc++.h>
using namespace std;

const int N = 100;
bool isPrime[N + 1];

void sieve()
{
    fill(isPrime, isPrime + N + 1, true);

    isPrime[0] = isPrime[1] = false;

    for (int i = 2; i * i <= N; i++)
    {
        if (isPrime[i])
        {
            for (int j = i * i; j <= N; j += i)
            {
                isPrime[j] = false;
            }
        }
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    sieve();

    int t;
    cin >> t;
    while (t-- > 0)
    {
        string n;
        int k, r, val = 0;
        cin >> k;
        cin >> n;
        bool ans = false;
        for (char c : n)
        {
            r = c - '0';
            if (!isPrime[r])
            {
                ans = true;
                val = r;
                break;
            }
        }

        if (ans == true)
        {
            cout << 1 << '\n'
                 << val << '\n';
            continue;
        }

        for (int i = 0; i < k && !ans; i++)
        {
            for (int j = i + 1; j < k && !ans; j++)
            {
                int x = (n[i] - '0') * 10 + n[j] - '0';
                if (!isPrime[x])
                {
                    ans = true;
                    val = x;
                }
            }
        }

        cout << 2 << '\n'
             << val << '\n';
    }
    return 0;
}
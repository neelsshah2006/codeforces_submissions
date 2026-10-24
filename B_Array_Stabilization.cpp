#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    int fmx = INT_MIN, smx = INT_MIN;
    int fmn = INT_MAX, smn = INT_MAX;
    int tmp;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        if (tmp >= smx)
        {
            if (tmp >= fmx)
            {   
                smx = fmx;
                fmx = tmp;
            }
            else
                smx = tmp;
        }

        if (tmp <= smn)
        {
            if (tmp <= fmn)
            {
                smn = fmn;
                fmn = tmp;
            }
            else
                smn = tmp;
        }
    }

    int minInstability = min(fmx - smn, smx - fmn);
    cout << minInstability << '\n';
    return 0;
}